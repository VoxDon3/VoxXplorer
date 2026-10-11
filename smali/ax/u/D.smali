.class public final synthetic Lax/u/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/u/E;


# direct methods
.method public synthetic constructor <init>(Lax/u/E;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/u/D;->q:Lax/u/E;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u/D;->q:Lax/u/E;

    invoke-virtual {v0}, Lax/u/E;->d()V

    return-void
.end method
