.class public final synthetic Lax/Q0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Lax/Q0/f$c;


# direct methods
.method public synthetic constructor <init>(Lax/Q0/f$c;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Q0/g;->q:Lax/Q0/f$c;

    iput p2, p0, Lax/Q0/g;->c0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/g;->q:Lax/Q0/f$c;

    iget v1, p0, Lax/Q0/g;->c0:I

    invoke-static {v0, v1}, Lax/Q0/f$c;->a(Lax/Q0/f$c;I)V

    return-void
.end method
