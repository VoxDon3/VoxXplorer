.class public final synthetic Lax/Z0/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/Z0/u0;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/u0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/I;->q:Lax/Z0/u0;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z0/I;->q:Lax/Z0/u0;

    invoke-static {v0}, Lax/Z0/u0;->i1(Lax/Z0/u0;)V

    return-void
.end method
