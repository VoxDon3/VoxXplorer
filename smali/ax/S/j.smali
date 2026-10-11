.class public final synthetic Lax/S/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Lax/S/h$e;


# direct methods
.method public synthetic constructor <init>(Lax/S/h$e;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S/j;->q:Lax/S/h$e;

    iput p2, p0, Lax/S/j;->c0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/S/j;->q:Lax/S/h$e;

    iget v1, p0, Lax/S/j;->c0:I

    invoke-static {v0, v1}, Lax/S/h$e;->b(Lax/S/h$e;I)V

    return-void
.end method
